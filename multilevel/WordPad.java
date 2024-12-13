package com.tnsif.inheritence.multilevel;

public class WordPad extends NotePad {

	 private boolean isBold;

	public WordPad() {
		super();
		this.isBold=false;
	}
	 
   public void formatText(boolean bold) {
       if (bold) {
           content = "<b>" + content + "</b>";
       }
       isBold = bold;
   }
   
   public boolean isBold() {
       return isBold;
   }
	
}
