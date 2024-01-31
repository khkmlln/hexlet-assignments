package exercise;

// BEGIN
public class ReversedSequence {
    private String sequence;
    public ReversedSequence(String sequence) {
        this.sequence = sequence;
    }
    public int length() {
        return sequence.length();
    }
    public char charAt(int index) {
        return sequence.charAt(sequence.length() - 1 - index);
    }
    public CharSequence subSequence(int start, int end) {
        StringBuilder builder = new StringBuilder();
        for (int i = start; i < end; i++) {
            builder.append(sequence.charAt(sequence.length() - 1 - i));
        }
        return builder.toString();
    }
    public String toString() {
        StringBuilder builder = new StringBuilder(sequence);
        return builder.reverse().toString();
    }
}
// END
