// StringList1.java

import java.util.ArrayList;
import java.util.Random;

public class StringList1 {
    private ArrayList<String> items;

    public StringList1() {
        items = new ArrayList<>();
        populateList();
    }

    private void populateList() {
        //items.add("artless");
        items.add("bawdy");
        items.add("beslubbering");
        items.add("bootless");
        items.add("churlish");
        items.add("cockered");
        items.add("clouted");
        items.add("craven");
        items.add("currish");
        items.add("dankish");
        items.add("dissembling");
        items.add("droning");
        //items.add("errant");
        items.add("fawning");
        items.add("fobbing");
        items.add("froward");
        items.add("frothy");
        items.add("gleeking");
        items.add("goatish");
        items.add("gorbellied");
        //items.add("impertinent");
        //items.add("infectious");
        items.add("jarring");
        items.add("loggerhead");
        items.add("lumpish");
        items.add("mammering");
        items.add("mangled");
        items.add("mewling");
        items.add("paunchy");
        items.add("pribbling");
        items.add("puking");
        items.add("puny");
        items.add("qualling");
        items.add("rank");
        items.add("reeky");
        items.add("roguish");
        items.add("ruttish");
        items.add("saucy");
        items.add("spleeny");
        items.add("spongy");
        items.add("surly");
        items.add("tottering");
        //items.add("unmuzzled");
        items.add("vain");
        items.add("venomed");
        items.add("villainous");
        items.add("warped");
        items.add("wayward");
        items.add("weedy");
        items.add("yeasty");
    }

    public ArrayList<String> getItems() {
        return items;
}

    public String getRandomItem() {
        Random random = new Random();
        return items.get(random.nextInt(items.size()));
    }
}


