package algorithm;

import java.util.List;
import java.util.Date;

public class StockData {
	private String stat;
    private String date;
    private String title;
    private List<String> fields;
    private List<List<Date>> data;
    private List<String> notes;
    private int total;
    
	public String getStat() {
		return stat;
	}
	public void setStat(String stat) {
		this.stat = stat;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public List<String> getFields() {
		return fields;
	}
	public void setFields(List<String> fields) {
		this.fields = fields;
	}
	public List<List<Date>> getData() {
		return data;
	}
	public void setData(List<List<Date>> data) {
		this.data = data;
	}
	public List<String> getNotes() {
		return notes;
	}
	public void setNotes(List<String> notes) {
		this.notes = notes;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	@Override
	public String toString() {
		return "StockData [stat=" + stat + ", date=" + date + ", title=" + title + ", fields=" + fields + ", data="
				+ data + ", notes=" + notes + ", total=" + total + "]";
	}
    
    
    
}
