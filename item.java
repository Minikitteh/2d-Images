package priceWatcher;

//********************************************
//this is will be changed in the future but for
// now is just hard coded

public class item {
	  static String itemName = "Desk";;
	  static int itemPrice = 20;
	  static String itemUrl = "https://www.amazon.com/Writing-Computer-Industrial-Folding-Notebook/dp/B06XZV3F8F/ref=sxts_kp?keywords=table&pd_rd_i=B06XZV3F8F&pd_rd_r=61e75488-55ca-4e05-9496-cfbe16e8f1be&pd_rd_w=x4Q9J&pd_rd_wg=bOdmU&pf_rd_p=9e1f8218-b1c6-41ee-b8db-ab27d6c0f6de&pf_rd_r=YB5626K8WH2RD402SQRK&qid=1551825074&s=gateway";
	  
	  public static int setItemPrice(){
	    return (int) (20 + (Math.random() * 5));
	  }
	  
}
