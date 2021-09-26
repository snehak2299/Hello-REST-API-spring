package com.bridglab.springrest.beans;

public class Message implements org.apache.logging.log4j.message.Message {
	private String name;
	private String last;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getlast() {
		return last;
	}

	public void setlast(String last) {
		this.last = last;
	}

	public Message(String name, String text) {
		this.name = name;
		this.last = text;
	}

	public Message() {

	}

	@Override
	public String toString() {
		return "Message [name=" + name + ", text=" + last + "]";
	}

	@Override
	public String getFormattedMessage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getFormat() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] getParameters() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Throwable getThrowable() {
		// TODO Auto-generated method stub
		return null;
	}
}