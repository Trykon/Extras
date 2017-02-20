public class MainClass {

	public static void main(String[] args) {
		String[] PrefixJoined = {"Chill", "Dawn", "Dusk", "Shade", "Shadow", "Hero", "Flame", "Fire", "Ice", "Storm", "Light", "Fuck", "Slut", "Slave","Oath","Damn"};
		String[] AffixfixJoined = {"breaker", "bringer", "seeker","blade","fucker"};
		
		String[] PrefixSeparated = {"Light", "Hero's","Dusk","Dawn","Midnight","Seeker's","Enslaving","Fucking","Slut's", "Demonrage","Damn"};
		String[] AffixSeparated = {"Sword","Blade","Seeker","Breaker","Fucker","Slasher", "Bow"};
		
		String[] PrefixSeparatedOf = {"Blade", "Sword","Bow"};
		String[] AffixSeparatedOf = {"Fucks", "Light", "Shadows", "Sun", "Moon", "Moonlight","Rage","Sluts"};
		
		for(int i=0;i<10;i++)
		{
			int rand = (int) Math.ceil(Math.random()*3);
			int prefix;
			int affix;
			switch(rand)
			{
			case 1:
				prefix = (int) Math.floor(Math.random()*PrefixJoined.length);
				affix = (int) Math.floor(Math.random()*AffixfixJoined.length);
				System.out.println(PrefixJoined[prefix]+AffixfixJoined[affix]);
				break;
			case 2:
				prefix = (int) Math.floor(Math.random()*PrefixSeparated.length);
				affix = (int) Math.floor(Math.random()*AffixSeparated.length);
				System.out.println(PrefixSeparated[prefix]+" "+AffixSeparated[affix]);
				break;
			case 3:
				prefix = (int) Math.floor(Math.random()*PrefixSeparatedOf.length);
				affix = (int) Math.floor(Math.random()*AffixSeparatedOf.length);
				System.out.println(PrefixSeparatedOf[prefix]+" of "+AffixSeparatedOf[affix]);
				break;
			}
		}
	}
}
