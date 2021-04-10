package com.Dome01.Inner;

// 这时一个外部类
public class InnerClass {
    private boolean live = true;

    public InnerClass() {
    }

    public InnerClass(boolean live) {
        this.live = live;
    }

    public boolean isLive() {
        return live;
    }

    public void setLive(boolean live) {
        this.live = live;
    }

    class Inner{
        public void print(){
            System.out.println("这是内部类的第一个方法");
            if (live) {
                System.out.println("我可以直接使用外部类的变量");
            }else{
                System.out.println("我没有使用到外部类的变量");
            }
        }

        public void input(){
            System.out.println("这是内部类的第二个方法");
        }
    }
}
