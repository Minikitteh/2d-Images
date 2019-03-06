package priceWatcher;

//********************************************
//this is will be changed in the future but for
// now is just hard coded

public class item {
	  static String itemName = "Lenovo Laptop";;
	  static int itemPrice = 20;
	  static String itemUrl = "www.lenovo.com";
	  
	  public static int setItemPrice(){
	    return (int) (20 + (Math.random() * 5));
	  }
	  
}
