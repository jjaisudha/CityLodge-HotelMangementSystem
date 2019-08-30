package com.citylodge.beans;

import java.util.ArrayList;
import java.util.List;

public class Room {
private String roomId;
private int noofbed;
private String roomType;
private String summary;
private String roomStatus;
private String maintanenceDate;

List <Hiringrecord> hrecords = new ArrayList<Hiringrecord>();

/**
 * @return the roomId
 */
public String getRoomId() {
	return roomId;
}
/**
 * @param roomId the roomId to set
 */
public void setRoomId(String roomId) {
	this.roomId = roomId;
}
/**
 * @return the summary
 */
public String getSummary() {
	return summary;
}
/**
 * @param summary the summary to set
 */
public void setSummary(String summary) {
	this.summary = summary;
}
/**
 * @return the roomStatus
 */
public String getRoomStatus() {
	return roomStatus;
}
/**
 * @param roomStatus the roomStatus to set
 */
public void setRoomStatus(String roomStatus) {
	this.roomStatus = roomStatus;
}
/**
 * @return the maintanenceDate
 */
public String getMaintanenceDate() {
	return maintanenceDate;
}
/**
 * @param maintanenceDate the maintanenceDate to set
 */
public void setMaintanenceDate(String maintanenceDate) {
	this.maintanenceDate = maintanenceDate;
}
/**
 * @return the hrecords
 */
public List<Hiringrecord> getHrecords() {
	return hrecords;
}
/**
 * @param hrecords the hrecords to set
 */
public void setHrecords(List<Hiringrecord> hrecords) {
	this.hrecords = hrecords;
}
/**
 * @return the roomType
 */
public String getRoomType() {
	return roomType;
}
/**
 * @param roomType the roomType to set
 */
public void setRoomType(String roomType) {
	this.roomType = roomType;
}

/**
 * @return the noofbed
 */
public int getNoofbed() {
	return noofbed;
}
/**
 * @param noofbed the noofbed to set
 */
public void setNoofbed(int noofbed) {
	this.noofbed = noofbed;
}
}
