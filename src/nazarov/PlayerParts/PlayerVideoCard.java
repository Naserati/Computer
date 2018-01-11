package nazarov.PlayerParts;

import nazarov.Interfaces.VideoCard;

public class PlayerVideoCard implements VideoCard {
    @Override
    public void getVideo() {
        System.out.println("Tra-la-la, VideoPlayer!");
    }
}
