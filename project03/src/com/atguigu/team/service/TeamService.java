package com.atguigu.team.service;

import com.atguigu.team.domain.Architect;
import com.atguigu.team.domain.Designer;
import com.atguigu.team.domain.Employee;
import com.atguigu.team.domain.Programmer;

/**
 * @author oono
 * @date 2020 09 10
 */
public class TeamService {

    //开发团队team中的人数合计
    private static int counter = 1;
    //开发团队team中的最大人数
    private final int MAX_MEMBER = 5;
    //开发团队team：为Programmer类组成的数组，容量为设定好的常量MAX_MEMBER
    private Programmer[] team = new Programmer[MAX_MEMBER];
    //开发团队team中的现在实际人数（size）
    private int total = 0;

    public Programmer[] getTeam() {
        Programmer[] teamWithMembers = new Programmer[total];
        for (int i = 0; i < teamWithMembers.length; i++) {
            teamWithMembers[i] = team[i];
        }
        return teamWithMembers;
    }

    public void addMember(Employee e) throws TeamException{

        //成员已满
        if (total >= team.length) {
            throw new TeamException("成员已满，无法添加");
        }

        //非开发人员
        if (!(e instanceof Programmer)) {
            throw new TeamException("该成员不是开发人员，无法添加");
        }

        //已经在team中
        boolean flag = false;
        for (int i = 0; i < total; i++) {
            if (e.getId() == team[i].getId()) {
                flag = true;
            }
        }
        if (flag) {
            throw new TeamException("该员已是团队成员");
        }

        //status == holiday
        Programmer p = (Programmer) e;
        if ("HOLIDAY".equals(p.getStatus())) {
            throw new TeamException("该员工正在休假，无法添加");
        }

        //统计出目前开发团队中的程序员、设计师、架构师人数
        int numOfArchitects = 0;
        int numOfDesigners = 0;
        int numOfProgrammers = 0;
        for (int i = 0; i < team.length; i++) {
            if (team[i] instanceof Architect) {
                numOfArchitects++;
                continue;
            }
            if (team[i] instanceof Designer) {
                numOfDesigners++;
                continue;
            }
            if (team[i] instanceof Programmer) {
                numOfProgrammers++;
                continue;
            }
        }

        //不能超过一个架构师，两个设计师，三个程序员在同一团队
        if (p instanceof Architect && numOfArchitects >= 1) {
            throw new TeamException("团队中只能有一名架构师");
        }
        if (p instanceof Designer && numOfDesigners >= 2) {
            throw new TeamException("团队中只能有两名设计师");
        }
        if (p instanceof Programmer && numOfProgrammers >= 3) {
            throw new TeamException("团队中只能有三名程序员");
        }

        //此时可以把员工添加进开发团队，把memberId属性用set方法赋值好，且添加成功后counter和total都自增1，p的状态变成BUSY
        team[total] = p;
        p.setStatus(Status.BUSY);
        p.setMemberId(counter++);
        total++;
        System.out.println("添加成功！");
    }

    public void removeMember(int memberId) throws TeamException{
        boolean flag = true;
        for (int i = 0; i < total; i++) {
            if (team[i].getMemberId() == memberId) {
                //删除成功后，需要把total--，该员工状态改为FREE
                team[i].setStatus(Status.FREE);

                for (int j = i; j < total - 1; j++) {
                    team[j] = team[j + 1];
                }

                team[total-- - 1] = null;

                flag = false;
                break;
            }
        }
        if(flag){
            throw new TeamException("未找到指定TID员工在开发团队中，删除失败");
        }
    }

    public int getTotal(){
        return total;
    }

//    public static void main(String[] args) {
//
//        TeamService test = new TeamService();
//        //1. 测试初始team的状态
//
//        Programmer[] team = test.getTeam();
//        System.out.println(team);
//        for (Programmer e : team) {
//            System.out.println("memberId=" + e.getMemberId() + "\tid=" + e.getId() + "\tname=" + e.getName() + "\tage="
//                    + e.getAge() + "\tsalary=" + e.getSalary() + "\tstatus=" + e.getStatus() +
//                    "\tequipment=" + e.getEquipment().getDescription());
//        }
//    }

}
