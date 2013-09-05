package com.github.neko250.yonunca.soundbanks;

import java.util.*;

public class SoundBank {
	private ArrayList<Phrase> dataBase;
	private int index;
	
	public SoundBank() {
		long seed = System.nanoTime();
		
		dataBase = new ArrayList<Phrase>();
		index = 0;
		
		dataBase.add(new Phrase("audio/phrases/pablo/01_pablo.ogg", ""));
		dataBase.add(new Phrase("audio/phrases/pablo/02_pablo.ogg", ""));
		dataBase.add(new Phrase("audio/phrases/pablo/03_pablo.ogg", ""));
		dataBase.add(new Phrase("audio/phrases/pablo/04_pablo.ogg", ""));
		dataBase.add(new Phrase("audio/phrases/pablo/05_pablo.ogg", ""));
		dataBase.add(new Phrase("audio/phrases/pablo/06_pablo.ogg", ""));
		dataBase.add(new Phrase("audio/phrases/pablo/07_pablo.ogg", ""));
		dataBase.add(new Phrase("audio/phrases/pablo/08_pablo.ogg", ""));
		dataBase.add(new Phrase("audio/phrases/pablo/09_pablo.ogg", ""));
		dataBase.add(new Phrase("audio/phrases/pablo/0A_pablo.ogg", ""));
		dataBase.add(new Phrase("audio/phrases/pablo/0B_pablo.ogg", ""));
		dataBase.add(new Phrase("audio/phrases/pablo/0C_pablo.ogg", ""));
		dataBase.add(new Phrase("audio/phrases/pablo/0D_pablo.ogg", ""));
		dataBase.add(new Phrase("audio/phrases/pablo/0E_pablo.ogg", ""));
		dataBase.add(new Phrase("audio/phrases/pablo/0F_pablo.ogg", ""));
		dataBase.add(new Phrase("audio/phrases/pablo/10_pablo.ogg", ""));
		dataBase.add(new Phrase("audio/phrases/pablo/11_pablo.ogg", ""));
		dataBase.add(new Phrase("audio/phrases/pablo/12_pablo.ogg", ""));
		dataBase.add(new Phrase("audio/phrases/pablo/13_pablo.ogg", ""));
		dataBase.add(new Phrase("audio/phrases/pablo/14_pablo.ogg", ""));
		dataBase.add(new Phrase("audio/phrases/pablo/15_pablo.ogg", ""));
		dataBase.add(new Phrase("audio/phrases/pablo/16_pablo.ogg", ""));
		dataBase.add(new Phrase("audio/phrases/pablo/17_pablo.ogg", ""));
		dataBase.add(new Phrase("audio/phrases/pablo/18_pablo.ogg", ""));
		dataBase.add(new Phrase("audio/phrases/pablo/19_pablo.ogg", ""));
		dataBase.add(new Phrase("audio/phrases/pablo/1A_pablo.ogg", ""));
		dataBase.add(new Phrase("audio/phrases/pablo/1B_pablo.ogg", ""));
		dataBase.add(new Phrase("audio/phrases/pablo/1C_pablo.ogg", ""));
		dataBase.add(new Phrase("audio/phrases/pablo/1D_pablo.ogg", ""));
		dataBase.add(new Phrase("audio/phrases/pablo/1E_pablo.ogg", ""));
		dataBase.add(new Phrase("audio/phrases/pablo/1F_pablo.ogg", ""));
		dataBase.add(new Phrase("audio/phrases/pablo/20_pablo.ogg", ""));
		dataBase.add(new Phrase("audio/phrases/pablo/21_pablo.ogg", ""));
		dataBase.add(new Phrase("audio/phrases/pablo/22_pablo.ogg", ""));
		dataBase.add(new Phrase("audio/phrases/pablo/23_pablo.ogg", ""));
		dataBase.add(new Phrase("audio/phrases/pablo/24_pablo.ogg", ""));
		dataBase.add(new Phrase("audio/phrases/pablo/25_pablo.ogg", ""));
		dataBase.add(new Phrase("audio/phrases/pablo/26_pablo.ogg", ""));
		dataBase.add(new Phrase("audio/phrases/pablo/27_pablo.ogg", ""));
		dataBase.add(new Phrase("audio/phrases/pablo/28_pablo.ogg", ""));
		dataBase.add(new Phrase("audio/phrases/pablo/29_pablo.ogg", ""));
		dataBase.add(new Phrase("audio/phrases/pablo/2A_pablo.ogg", ""));
		dataBase.add(new Phrase("audio/phrases/pablo/2B_pablo.ogg", ""));
		dataBase.add(new Phrase("audio/phrases/pablo/2C_pablo.ogg", ""));
		
		dataBase.add(new Phrase("audio/phrases/mary/01_mary.ogg", ""));
		dataBase.add(new Phrase("audio/phrases/mary/02_mary.ogg", ""));
		dataBase.add(new Phrase("audio/phrases/mary/03_mary.ogg", ""));
		dataBase.add(new Phrase("audio/phrases/mary/04_mary.ogg", ""));
		dataBase.add(new Phrase("audio/phrases/mary/05_mary.ogg", ""));
		dataBase.add(new Phrase("audio/phrases/mary/06_mary.ogg", ""));
		dataBase.add(new Phrase("audio/phrases/mary/07_mary.ogg", ""));
		dataBase.add(new Phrase("audio/phrases/mary/08_mary.ogg", ""));
		dataBase.add(new Phrase("audio/phrases/mary/09_mary.ogg", ""));
		dataBase.add(new Phrase("audio/phrases/mary/0A_mary.ogg", ""));
		dataBase.add(new Phrase("audio/phrases/mary/0B_mary.ogg", ""));
		dataBase.add(new Phrase("audio/phrases/mary/0C_mary.ogg", ""));
		dataBase.add(new Phrase("audio/phrases/mary/0D_mary.ogg", ""));
		dataBase.add(new Phrase("audio/phrases/mary/0E_mary.ogg", ""));
		dataBase.add(new Phrase("audio/phrases/mary/0F_mary.ogg", ""));
		dataBase.add(new Phrase("audio/phrases/mary/10_mary.ogg", ""));
		dataBase.add(new Phrase("audio/phrases/mary/11_mary.ogg", ""));
		dataBase.add(new Phrase("audio/phrases/mary/12_mary.ogg", ""));
		dataBase.add(new Phrase("audio/phrases/mary/13_mary.ogg", ""));
		dataBase.add(new Phrase("audio/phrases/mary/14_mary.ogg", ""));
		dataBase.add(new Phrase("audio/phrases/mary/15_mary.ogg", ""));
		dataBase.add(new Phrase("audio/phrases/mary/16_mary.ogg", ""));
		dataBase.add(new Phrase("audio/phrases/mary/17_mary.ogg", ""));
		dataBase.add(new Phrase("audio/phrases/mary/18_mary.ogg", ""));
		dataBase.add(new Phrase("audio/phrases/mary/19_mary.ogg", ""));
		dataBase.add(new Phrase("audio/phrases/mary/1A_mary.ogg", ""));
		dataBase.add(new Phrase("audio/phrases/mary/1B_mary.ogg", ""));
		dataBase.add(new Phrase("audio/phrases/mary/1C_mary.ogg", ""));
		dataBase.add(new Phrase("audio/phrases/mary/1D_mary.ogg", ""));
		dataBase.add(new Phrase("audio/phrases/mary/1E_mary.ogg", ""));
		dataBase.add(new Phrase("audio/phrases/mary/1F_mary.ogg", ""));
		dataBase.add(new Phrase("audio/phrases/mary/20_mary.ogg", ""));
		dataBase.add(new Phrase("audio/phrases/mary/21_mary.ogg", ""));
		dataBase.add(new Phrase("audio/phrases/mary/22_mary.ogg", ""));
		dataBase.add(new Phrase("audio/phrases/mary/23_mary.ogg", ""));
		dataBase.add(new Phrase("audio/phrases/mary/24_mary.ogg", ""));
		dataBase.add(new Phrase("audio/phrases/mary/25_mary.ogg", ""));
		dataBase.add(new Phrase("audio/phrases/mary/26_mary.ogg", ""));
		dataBase.add(new Phrase("audio/phrases/mary/27_mary.ogg", ""));
		dataBase.add(new Phrase("audio/phrases/mary/28_mary.ogg", ""));
		dataBase.add(new Phrase("audio/phrases/mary/29_mary.ogg", ""));
		dataBase.add(new Phrase("audio/phrases/mary/2A_mary.ogg", ""));
		dataBase.add(new Phrase("audio/phrases/mary/2B_mary.ogg", ""));
		dataBase.add(new Phrase("audio/phrases/mary/2C_mary.ogg", ""));
		
		dataBase.add(new Phrase("audio/phrases/nano/01_nano.ogg", ""));
		dataBase.add(new Phrase("audio/phrases/nano/02_nano.ogg", ""));
		dataBase.add(new Phrase("audio/phrases/nano/03_nano.ogg", ""));
		dataBase.add(new Phrase("audio/phrases/nano/04_nano.ogg", ""));
		dataBase.add(new Phrase("audio/phrases/nano/05_nano.ogg", ""));
		dataBase.add(new Phrase("audio/phrases/nano/06_nano.ogg", ""));
		dataBase.add(new Phrase("audio/phrases/nano/07_nano.ogg", ""));
		dataBase.add(new Phrase("audio/phrases/nano/08_nano.ogg", ""));
		dataBase.add(new Phrase("audio/phrases/nano/09_nano.ogg", ""));
		dataBase.add(new Phrase("audio/phrases/nano/0A_nano.ogg", ""));
		dataBase.add(new Phrase("audio/phrases/nano/0B_nano.ogg", ""));
		dataBase.add(new Phrase("audio/phrases/nano/0C_nano.ogg", ""));
		dataBase.add(new Phrase("audio/phrases/nano/0D_nano.ogg", ""));
		dataBase.add(new Phrase("audio/phrases/nano/0E_nano.ogg", ""));
		dataBase.add(new Phrase("audio/phrases/nano/0F_nano.ogg", ""));
		dataBase.add(new Phrase("audio/phrases/nano/10_nano.ogg", ""));
		dataBase.add(new Phrase("audio/phrases/nano/11_nano.ogg", ""));
		dataBase.add(new Phrase("audio/phrases/nano/12_nano.ogg", ""));
		dataBase.add(new Phrase("audio/phrases/nano/13_nano.ogg", ""));
		dataBase.add(new Phrase("audio/phrases/nano/14_nano.ogg", ""));
		dataBase.add(new Phrase("audio/phrases/nano/15_nano.ogg", ""));
		dataBase.add(new Phrase("audio/phrases/nano/16_nano.ogg", ""));
		dataBase.add(new Phrase("audio/phrases/nano/17_nano.ogg", ""));
		dataBase.add(new Phrase("audio/phrases/nano/18_nano.ogg", ""));
		dataBase.add(new Phrase("audio/phrases/nano/19_nano.ogg", ""));
		dataBase.add(new Phrase("audio/phrases/nano/1A_nano.ogg", ""));
		dataBase.add(new Phrase("audio/phrases/nano/1B_nano.ogg", ""));
		dataBase.add(new Phrase("audio/phrases/nano/1C_nano.ogg", ""));
		dataBase.add(new Phrase("audio/phrases/nano/1D_nano.ogg", ""));
		dataBase.add(new Phrase("audio/phrases/nano/1E_nano.ogg", ""));
		dataBase.add(new Phrase("audio/phrases/nano/1F_nano.ogg", ""));
		dataBase.add(new Phrase("audio/phrases/nano/20_nano.ogg", ""));
		dataBase.add(new Phrase("audio/phrases/nano/21_nano.ogg", ""));
		dataBase.add(new Phrase("audio/phrases/nano/22_nano.ogg", ""));
		dataBase.add(new Phrase("audio/phrases/nano/23_nano.ogg", ""));
		dataBase.add(new Phrase("audio/phrases/nano/24_nano.ogg", ""));
		dataBase.add(new Phrase("audio/phrases/nano/25_nano.ogg", ""));
		dataBase.add(new Phrase("audio/phrases/nano/26_nano.ogg", ""));
		dataBase.add(new Phrase("audio/phrases/nano/27_nano.ogg", ""));
		dataBase.add(new Phrase("audio/phrases/nano/28_nano.ogg", ""));
		dataBase.add(new Phrase("audio/phrases/nano/29_nano.ogg", ""));
		dataBase.add(new Phrase("audio/phrases/nano/2A_nano.ogg", ""));
		dataBase.add(new Phrase("audio/phrases/nano/2B_nano.ogg", ""));
		dataBase.add(new Phrase("audio/phrases/nano/2C_nano.ogg", ""));
		
		Collections.shuffle(dataBase, new Random(seed));
	}
	
	public void playNext() {
		long seed = System.nanoTime();
		
		index++;
		if (index > dataBase.size()) {
			index = 0;
			Collections.shuffle(dataBase, new Random(seed));
		}
		
		replay();
	}
	
	public void replay() {
		dataBase.get(index).play();
	}
}
