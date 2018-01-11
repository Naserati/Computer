package nazarov.DNSParts;

import nazarov.Interfaces.SoundCard;

public class DNSSoundCard implements SoundCard {
    @Override
    public void playMusic() {
        System.out.println("Listen to DNS Music.. la-la-pam");
    }
}
