package com.natsuki;

/**
 * @author xuzhiwei
 * created at 2018-12-15
 */
public class RewardSystem {

    public void visit(Teacher teacher){
        if (teacher.getSci()>10){
            System.out.println(teacher.getName()+"老师被评为科研奖");
        }
        if (teacher.getScore()>90){
            System.out.println(teacher.getName()+"老师被评为成绩优秀奖");
        }
    }

    public void visit(Student student){
        if (student.getSci()>2){
            System.out.println(student.getName()+"学生被评为科研奖");
        }
        if (student.getScore()>90){
            System.out.println(student.getName()+"学生被评为成绩优秀奖");
        }
    }

}
