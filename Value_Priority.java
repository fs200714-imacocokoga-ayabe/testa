package rennsyuuyou;

public class Value_Priority {

    private int _priority;
    private String _value;

    public Value_Priority(int pri, String val) {

        _priority = pri;
        _value = val;
    }

    public int Getpriority() {

        return _priority;
    }

    public String Getvalue() {

        return _value;
    }

    public void Setpriority(int pri) {

        _priority = pri;
    }

    public void Setvalue(String val) {

        _value = val;
    }
}


