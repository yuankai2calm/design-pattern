package cn.master.pattern.proxy.sample_1.impl;

import cn.master.pattern.proxy.sample_1.IGamePlayer;

public class GamePlayer implements IGamePlayer {
    private String name = null;
    public GamePlayer (String name) {
        this.name = name;
    }

    @Override
    public void login(String username, String password) {
        System.out.println("用户：" + username + "登录");
    }

    @Override
    public void battle() {
        System.out.println(name + "游戏战斗");
    }

    @Override
    public void upgrade() {
        System.out.println(name + "升级");
    }
}
