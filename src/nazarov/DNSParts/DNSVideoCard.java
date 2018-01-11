package nazarov.DNSParts;

import nazarov.Interfaces.VideoCard;

public class DNSVideoCard implements VideoCard {
    @Override
    public void getVideo() {
        System.out.println("I show you DNS Shop!");
    }
}
