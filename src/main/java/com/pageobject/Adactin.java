package com.pageobject;

public class Adactin extends LibGlobal {
	public static void main(String[] args) {
		getDriver();
		maximize();
	    getUrl("https://www.adactin.com/HotelApp/");
	
	
		LoginPage page=new LoginPage();
		type(page.getTxtUserName(),"Jayanthan");
		type(page.getTxtPassword(),"password123");
		click(page.getLoginBtn());
		
		
		SearchHotel h=new SearchHotel();
		selectbyIndex(h.getLoc(), 1);
		selectbyIndex(h.getHotels(), 2);
		selectbyIndex(h.getRoomType(), 2);
		selectbyIndex(h.getRoomNo(), 1);
		type(h.getCheckinDate(), "25/01/2020");
		type(h.getCheckoutDate(),"30/01/2020");
		selectbyIndex(h.getAdultRoom(), 3);
		selectbyIndex(h.getChildRoom(), 2);
		click(h.getSearch());
		
		
		SelectHotel sh=new SelectHotel();
		click(sh.getRadio());
		click(sh.getSelectHotel());
		
		BookHotel bh=new BookHotel();
		type(bh.getFirstName(), "Jayanthan");
		type(bh.getLastName(),"Chandran");
		type(bh.getAddress(), "no 19 3rd st gandhi nagar guduvancheri");
		type(bh.getCc(),"2342342342342344");
        selectbyIndex(bh.getCcType(), 1);	
        selectbyIndex(bh.getCcExpMonth(), 4);
        selectbyIndex(bh.getCcExpYear(), 10);
        type(bh.getCvv(), "1234");
        click(bh.getBookNow());
        
       // OrderNo oNo=new OrderNo();
       // textGet(oNo.getOrderNo());
       // System.out.println(s);
	}

}
