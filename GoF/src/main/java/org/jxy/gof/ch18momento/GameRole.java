package com.elong.design.pattern.ch18momento;

public class GameRole {
	
	private int hp;
	private int attack;
	private int defense;
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getAttack() {
		return attack;
	}
	public void setAttack(int attack) {
		this.attack = attack;
	}
	public int getDefense() {
		return defense;
	}
	public void setDefense(int defense) {
		this.defense = defense;
	}
	
	public RoleStateMomento SaveState() {
		return new RoleStateMomento(hp,attack,defense);
	}
	
	public void RecoveryState(RoleStateMomento momento) {
		this.hp = momento.getHp();
		this.attack = momento.getAttack();
		this.defense = momento.getDefense();
	}
	
	public void StateDisplay() {
		System.out.println("Current role status");
		System.out.println("Hp: " + this.hp);
		System.out.println("Attack: " + this.attack);
		System.out.println("Defense: " + this.defense);
		System.out.println("");
	}
	
	public void GetInitState() {
		this.hp = 100;
		this.attack = 100;
		this.defense = 100;
	}
	
	public void Fight() {
		this.hp = 0;
		this.attack = 0;
		this.defense = 0;
	}

}
