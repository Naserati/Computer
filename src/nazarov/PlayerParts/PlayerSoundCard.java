package nazarov.PlayerParts;

import nazarov.Interfaces.SoundCard;

public class PlayerSoundCard implements SoundCard {
    @Override
    public void playMusic() {
        System.out.println("I won't dance with you, my Player");
    }
}
