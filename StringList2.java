// StringList2.java

import java.util.ArrayList;
import java.util.Random;

public class StringList2 {
    private ArrayList<String> items;

    public StringList2() {
        items = new ArrayList<>();
        populateList();
    }

    private void populateList() {
        items.add("base-court");
        items.add("bat-fowling");
        items.add("beef-witted");
        items.add("beetle-headed");
        items.add("boil-brained");
        items.add("clapper-clawed");
        items.add("clay-brained");
        items.add("common-kissing");
        items.add("crook-pated");
        items.add("dismal-dreaming");
        items.add("dizzy-eyed");
        items.add("doghearted");
        items.add("dread-bolted");
        items.add("earth-vexing");
        items.add("elf-skinned");
        items.add("fat-kidneyed");
        items.add("fen-sucked");
        items.add("flap-mouthed");
        items.add("fly-bitten");
        items.add("folly-fallen");
        items.add("fool-born");
        items.add("full-gorged");
        items.add("guts-griping");
        items.add("half-faced");
        items.add("hasty-witted");
        items.add("hedge-born");
        items.add("hell-hated");
        items.add("idle-headed");
        items.add("ill-breeding");
        items.add("ill-nurtured");
        items.add("knotty-pated");
        items.add("milk-livered");
        items.add("motley-minded");
        items.add("onion-eyed");
        items.add("plume-plucked");
        items.add("pottle-deep");
        items.add("pox-marked");
        items.add("reeling-ripe");
        items.add("rough-hewn");
        items.add("rude-growing");
        items.add("rump-fed");
        items.add("shard-borne");
        items.add("sheep-biting");
        items.add("spur-galled");
        items.add("swag-bellied");
        items.add("tardy-gaited");
        items.add("tickle-brained");
        items.add("toad-spotted");
        items.add("unchin-snouted");
        items.add("weather-bitten");
    }

    public ArrayList<String> getItems() {
        return items;
}

    public String getRandomItem() {
        Random random = new Random();
        return items.get(random.nextInt(items.size()));
    }
}


