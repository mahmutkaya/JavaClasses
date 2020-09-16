package techproedenglish01.techproedenglish01api;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

							/*
							 When you create a Pojo Class, it should have;
								 	1)private variables
								 	2)getter() and setter() methods for all varibales
								 	3)Constructor with all parameters
								 	4)Constructor without parameters
								 	5)toString()
							 */

public class BookingDatesDt {

	@SerializedName("checkin")
	@Expose
	private String checkin;
	@SerializedName("checkout")
	@Expose
	private String checkout;
	
	public String getCheckin() {
	return checkin;
	}	
	public void setCheckin(String checkin) {
	this.checkin = checkin;
	}	
	public String getCheckout() {
	return checkout;
	}	
	public void setCheckout(String checkout) {
	this.checkout = checkout;
	}
	public BookingDatesDt(String checkin, String checkout) {
		this.checkin = checkin;
		this.checkout = checkout;
	}
	public BookingDatesDt() {
		
	}
	@Override
	public String toString() {
		return "BookingDatesDt [checkin=" + checkin + ", checkout=" + checkout + "]";
	}

}
