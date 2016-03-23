package socialmedia;

public class YouTubeAdapter implements SocialMediaEntry {

  private YouTubeVideo video;

  public YouTubeAdapter(YouTubeVideo video) {
    this.video = video;
  }

  public String getUser() {
    return video.getAuthor();
  }

  public String getPostText() {
    return video.getTitle() + "\n" + video.getDescription();
  }

}
