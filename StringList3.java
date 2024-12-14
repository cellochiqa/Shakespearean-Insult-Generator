// StringList3.java

import java.util.ArrayList;
import java.util.Random;

public class StringList3 {
    private ArrayList<String> items;

    public StringList3() {
        items = new ArrayList<>();
        populateList();
    }

    private void populateList() {
        items.add("apple-john");
        items.add("baggage");
        items.add("barnacle");
        items.add("bladder");
        items.add("boar-pig");
        items.add("bugbear");
        items.add("bum-bailey");
        items.add("canker-blossom");
        items.add("clack-dish");
        items.add("clotpole");
        items.add("coxcomb");
        items.add("codpiece");
        items.add("death-token");
        items.add("dewberry");
        items.add("flap-dragon");
        items.add("flax-wench");
        items.add("flirt-gill");
        items.add("foot-licker");
        items.add("fustilarian");
        items.add("giglet");
        items.add("gudgeon");
        items.add("haggard");
        items.add("harpy");
        items.add("hedge-pig");
        items.add("horn-beast");
        items.add("hugger-mugger");
        items.add("joithead");
        items.add("lewdster");
        items.add("lout");
        items.add("maggot-pie");
        items.add("malt-worm");
        items.add("mammet");
        items.add("measle");
        items.add("minnow");
        items.add("miscreant");
        items.add("modlwarp");
        items.add("mumble-news");
        items.add("nut-hook");
        items.add("pigeon-egg");
        items.add("pignut");
        items.add("puttock");
        items.add("pumpion");
        items.add("ratsbane");
        items.add("scut");
        items.add("skainsmate");
        items.add("strumpet");
        items.add("varlot");
        items.add("vassal");
        items.add("whey-face");
        items.add("wagtail");
    }

    public ArrayList<String> getItems() {
        return items;
}

    public String getRandomItem() {
        Random random = new Random();
        return items.get(random.nextInt(items.size()));
    }
}


