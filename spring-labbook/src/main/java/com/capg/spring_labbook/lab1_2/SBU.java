package com.capg.spring_labbook.lab1_2;

import org.springframework.stereotype.Component;

@Component("sbu")
public class SBU {

private int sbuId;
private String sbuName;
private String sbuHead;
public int getSbuId() {
	return sbuId;
}
public void setSbuId(int sbuId) {
	this.sbuId = sbuId;
}
public String getSbuName() {
	return sbuName;
}
public void setSbuName(String sbuName) {
	this.sbuName = sbuName;
}
public String getSbuHead() {
	return sbuHead;
}
public void setSbuHead(String sbuHead) {
	this.sbuHead = sbuHead;
}
@Override
public String toString() {
	return "SBU [sbuId=" + sbuId + ", sbuName=" + sbuName + ", sbuHead=" + sbuHead + "]";
}


}