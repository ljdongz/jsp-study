package jspbook.ch06;

import java.util.ArrayList;
import java.util.List;

public class AddrManager {
	
	List<AddrVO> addrlist = new ArrayList<AddrVO>();

	public List<AddrVO> getAddrList() {
		return addrlist;
	}

	public void add(AddrVO ab) {
		addrlist.add(ab);
	}
		
}
