package dafpackage;

import java.util.Scanner;

public class MainClass {
	
	static int head =23;
	static int body =49;
	static int hands =18;
	static int feet =18;
	static int shield =36;
	static int armorPerkLevel = 5; //5 max
	static boolean unisonPerk = false;
	static boolean matchingSet = false;
	static int magicArmor =150;
	static int smithingBonus = 10; //10 max
	
	static void print(String s){
		System.out.println(s);
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		head = (int) Math.ceil((head+smithingBonus)*(1+0.4*(100)/100));
		body = (int) Math.ceil((body+smithingBonus*2)*(1+0.4*(100)/100));
		hands = (int) Math.ceil((hands+smithingBonus)*(1+0.4*(100)/100));
		feet = (int) Math.ceil((feet+smithingBonus)*(1+0.4*(100)/100));
		shield = (int) Math.ceil((shield+smithingBonus)*(1+0.4*(100)/100));
		int totalArmorRating;
		totalArmorRating=head+body+hands+feet;
		totalArmorRating*=(1+ armorPerkLevel*20/100);
		totalArmorRating+=shield;
		if(unisonPerk)
			totalArmorRating*= (1+25/100);
		if(matchingSet)
			totalArmorRating*= (1+25/100);
		totalArmorRating+=magicArmor;
		int percentRes=0;
		if(head>0)
			percentRes+=3;
		if(body>0)
			percentRes+=3;
		if(hands>0)
			percentRes+=3;
		if(feet>0)
			percentRes+=3;
		if(shield>0)
			percentRes+=3;
		percentRes+=totalArmorRating*0.12;
		//percentRes=Math.min(percentRes, 80);
		print(""+totalArmorRating);
		print(""+percentRes);
	}
}