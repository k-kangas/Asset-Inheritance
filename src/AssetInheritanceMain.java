/*
 * Kurt Kangas
 * CIS 2212 Java Software Development I
 * Asset Inheritance - Practice with Inheritance
 */

import java.util.Scanner;
import java.util.ArrayList;

public class AssetInheritanceMain {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		ArrayList<Asset> assetList = new ArrayList<>();
		
		System.out.println("Inheritance Project - Assets");
		
		Stock microsoft = new Stock("Microsoft", 8000, 1994, "MSFT", 200, 56);
		Building beachHouse = new Building("Beach House", 9000, 1964, 35000,"123 Seashore Ave, Malibu, CA");
		Art nighthawks = new Art("Nighthawks", 850, 1955, 7500, "Edward Hopper", 1942);

		assetList.add(microsoft);
		assetList.add(beachHouse);
		assetList.add(nighthawks);

		System.out.println("\nAmmoritzed costs per year:");
		System.out.println("Microsoft Stock $ " + microsoft.amortizedCost(2002));
		System.out.println("Beach House \t$ " + beachHouse.amortizedCost(2002));
		System.out.println("Nighthawks \t$ " + nighthawks.amortizedCost(2002));
		System.out.println("\nValuations:");
		System.out.println(microsoft.getName() + "\t$"  + microsoft.computeValue());
		System.out.println(beachHouse.getName() + "\t$"  + beachHouse.getValue());
		System.out.println(  "\t$"  + nighthawks.getValue());
		
		
		
		System.out.println("\nAsset Details:");
		System.out.println(microsoft.getName());
		System.out.println(microsoft.getCost());
		System.out.println();
		System.out.println(microsoft.getTickerSymbol());
		System.out.println(microsoft.getShares());
		System.out.println(microsoft.getPrice());
		// 
		System.out.println();
		System.out.println(beachHouse.getName());
		System.out.println(beachHouse.getCost());
		System.out.println();
		System.out.println(beachHouse.getValue());
		System.out.println(beachHouse.getAddress());
		//
		System.out.println();
		System.out.println(nighthawks.getName());
		System.out.println(nighthawks.getCost());
		System.out.println();
		System.out.println(nighthawks.getValue());
		System.out.println(nighthawks.getName());
		System.out.println(nighthawks.getYear());
		
		
	}

}
