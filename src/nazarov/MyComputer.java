package nazarov;

import nazarov.Interfaces.Processor;
import nazarov.Interfaces.SoundCard;
import nazarov.Interfaces.VideoCard;

public class MyComputer implements nazarov.Interfaces.Computer{

    private Processor processor;
    private VideoCard videoCard;
    private SoundCard soundCard;

    private int price;
    private String color;

    public MyComputer(){}

    public MyComputer(Processor processor, VideoCard videoCard, SoundCard soundCard) {
        this.processor = processor;
        this.videoCard = videoCard;
        this.soundCard = soundCard;
    }

    public MyComputer(int price, String color) {
        this.price = price;
        this.color = color;
    }

    @Override
    public void start() {
        processor.calculate();
        videoCard.getVideo();
        soundCard.playMusic();
        System.out.println(price);
        System.out.println(color);
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public VideoCard getVideoCard() {
        return videoCard;
    }

    public void setVideoCard(VideoCard videoCard) {
        this.videoCard = videoCard;
    }

    public SoundCard getSoundCard() {
        return soundCard;
    }

    public void setSoundCard(SoundCard soundCard) {
        this.soundCard = soundCard;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
