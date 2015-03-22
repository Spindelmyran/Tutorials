package tutorials.codeproject.observerPattern;

/**
 * @author Tony Andersson <mailto:Tony.andersson@so4it.com/>
 * @since 0.0.11
 */
public interface Observer {
    public void update(String availability);
    public void tell(String availability);
}