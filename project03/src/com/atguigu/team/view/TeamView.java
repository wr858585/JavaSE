package com.atguigu.team.view;

import com.atguigu.team.domain.Architect;
import com.atguigu.team.domain.Designer;
import com.atguigu.team.domain.Employee;
import com.atguigu.team.domain.Programmer;
import com.atguigu.team.service.NameListService;
import com.atguigu.team.service.TeamException;
import com.atguigu.team.service.TeamService;
import jdk.internal.org.objectweb.asm.tree.TableSwitchInsnNode;

/**
 * @author oono
 * @date 2020 09 10
 */
public class TeamView {

    //listSvc是整个公司所有人员的管理逻辑
    private NameListService listSvc = new NameListService();
    //teamSvc是开发团队的管理逻辑
    private TeamService teamSvc = new TeamService();

    public void enterMainMenu() {

        boolean flag = true;

        do {
            System.out.println("--------------------------开发团队调度系统--------------------------");
            System.out.println();
            System.out.println("ID\t姓名\t\t年龄\t\t工资\t\t职位\t\t状态\t\t奖金\t\t股票\t\t领用设备");

            Employee[] allEmployees = listSvc.getAllEmployees();
            for (Employee e : allEmployees) {
                System.out.println(e);
            }

            System.out.println("------------------------------------------------------------------");
            System.out.println("1-团队成员\t2-添加团队成员\t3-删除团队成员\t4-退出");
            System.out.println("请选择（1-4）：");

            char key = TSUtility.readMenuSelection();
            switch (key) {
                case '1':
                    System.out.println("--------------------------团队成员列表--------------------------");
                    listAllEmployees();
                    break;
                case '2':
                    System.out.println("--------------------------添加团队成员--------------------------");
                    addMember();
                    break;
                case '3':
                    System.out.println("--------------------------删除团队成员--------------------------");
                    deleteMember();
                    break;
                case '4':
                    flag = false;
                    break;
            }
        } while (flag);
    }

    //以表格形式列出所有公司员工
    private void listAllEmployees() {
        Programmer[] team = teamSvc.getTeam();
        if (teamSvc.getTotal() == 0) {
            System.out.println("温馨提示：当前并无开发人员");
            System.out.println("请重新选择哦");
            return;
        }
        System.out.println("TID/ID\t姓名\t\t年龄\t\t工资\t\t职位\t\t奖金\t\t股票");
        for (Programmer e : team) {
            if (e instanceof Architect) {
                Architect a = (Architect) e;
                System.out.println(a.getMemberId() + "/" + a.getId() + "\t\t" + a.getName() + "\t" + a.getAge() + "\t\t" + a.getSalary()
                        + "\t" + a.getPosition() + "\t" + a.getBonus() + "\t" + a.getStock());
                continue;
            } else if (e instanceof Designer) {
                Designer d = (Designer) e;
                System.out.println(d.getMemberId() + "/" + d.getId() + "\t\t" + d.getName() + "\t" + d.getAge() + "\t\t" + d.getSalary()
                        + "\t" + d.getPosition() + "\t" + d.getBonus());
                continue;
            } else {
                System.out.println(e.getMemberId() + "/" + e.getId() + "\t\t" + e.getName() + "\t" + e.getAge() + "\t\t" + e.getSalary()
                        + "\t" + e.getPosition());
            }
        }
    }

    //实现添加成员操作
    private void addMember() {
        System.out.println("请输入要添加的员工ID：");
        int id = TSUtility.readInt();
        Employee addEmployee = listSvc.getEmployee(id);
        try {
            teamSvc.addMember(addEmployee);
        } catch (TeamException e) {
            System.out.println(e.getMessage());
        }
        TSUtility.readReturn();
    }

    //实现删除成员操作
    private void deleteMember() {
        System.out.println("请输入要删除的员工的TID（团队编号）：");
        int tid = TSUtility.readInt();
        try {
            teamSvc.removeMember(tid);
        } catch (TeamException e) {
            System.out.println(e.getMessage());;
        }
        TSUtility.readReturn();
    }

    public static void main(String[] args) {

        TeamView view = new TeamView();
        view.enterMainMenu();
    }
}
