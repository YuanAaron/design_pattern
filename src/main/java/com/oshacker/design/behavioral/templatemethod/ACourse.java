package com.oshacker.design.principle.behavioral.templatemethod;

public abstract class ACourse {

    //final: 不希望子类覆盖该方法，防止修改该方法中的录制课程的流程。
    protected final void makeCourse() {
        this.makePPT();
        this.makeVedio();
        //设计模式课程需要编写手记，前端课程不需要编写手记
        if (needWriteArticle()) {
            this.writeArticle();
        }
        //设计模式课程只提供源码，前端课程提供源码+图片等素材
        this.packageCourse();
    }

    //final: 制作任何课程都要制作PPT，并且实现满足所有子类
    final void makePPT() {
        System.out.println("制作PPT");
    }

    final void makeVedio() {
        System.out.println("制作视频");
    }

    final void writeArticle() {
        System.out.println("编写手记");
    }

    //钩子方法: 默认false，非final，子类可以覆盖
    protected boolean needWriteArticle() {
        return false;
    }

    //包装课程完全交给子类去实现
    abstract void packageCourse();
}
