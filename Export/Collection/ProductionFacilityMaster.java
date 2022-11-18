package com.collection.assgn;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ProductionFacility
{
	private int pliid;
	private String pro_facility_name;
	private String pro_fa_location;
	private int totalProduction_perday;
	private String itemnames[];
	private LocalDate prod_date;
	public ProductionFacility() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProductionFacility(int pliid, String pro_facility_name, String pro_fa_location, int totalProduction_perday,
			String[] itemnames, LocalDate prod_date) {
		super();
		this.pliid = pliid;
		this.pro_facility_name = pro_facility_name;
		this.pro_fa_location = pro_fa_location;
		this.totalProduction_perday = totalProduction_perday;
		this.itemnames = itemnames;
		this.prod_date = prod_date;
	}
	public int getPliid() {
		return pliid;
	}
	public void setPliid(int pliid) {
		this.pliid = pliid;
	}
	public String getPro_facility_name() {
		return pro_facility_name;
	}
	public void setPro_facility_name(String pro_facility_name) {
		this.pro_facility_name = pro_facility_name;
	}
	public String getPro_fa_location() {
		return pro_fa_location;
	}
	public void setPro_fa_location(String pro_fa_location) {
		this.pro_fa_location = pro_fa_location;
	}
	public int getTotalProduction_perday() {
		return totalProduction_perday;
	}
	public void setTotalProduction_perday(int totalProduction_perday) {
		this.totalProduction_perday = totalProduction_perday;
	}
	public String[] getItemnames() {
		return itemnames;
	}
	public void setItemnames(String[] itemnames) {
		this.itemnames = itemnames;
	}
	public LocalDate getProd_date() {
		return prod_date;
	}
	public void setProd_date(LocalDate prod_date) {
		this.prod_date = prod_date;
	}
	@Override
	public String toString() {
		return "ProductionFacility [pliid=" + pliid + ", pro_facility_name=" + pro_facility_name + ", pro_fa_location="
				+ pro_fa_location + ", totalProduction_perday=" + totalProduction_perday + ", itemnames="
				+ Arrays.toString(itemnames) + ", prod_date=" + prod_date + "]";
	}
	
	
	

}
public class ProductionFacilityMaster {
	public static void main(String[] args) {
		List<ProductionFacility>l=new ArrayList<>();
	}

}
