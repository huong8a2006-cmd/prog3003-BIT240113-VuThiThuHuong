/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExThree;

/**
 *
 * @author admin
 */
public class HomeTheaterfacade {
    private final TV tv ;
    private final SoundSystem sound ;
    private final DVDPlayer dvd ;

    public HomeTheaterfacade(){
    this.tv = new TV();
    this.sound = new SoundSystem();
    this.dvd = new DVDPlayer();
    }
    public void watchMovie() {
        System.out.println("Chuẩn bị xem phim...");
        tv.on();
        sound.setVolume(20);
        dvd.play();
    }
}

