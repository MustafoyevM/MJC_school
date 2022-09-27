package talks.mjc_stage1.string;

    import com.sun.jdi.connect.Connector;

import java.util.ArrayList;
import java.util.List;

public class MethodSignature {
    private String accessModifier;
    private String returnType;
    private String methodName;
    private final List<Argument> arguments;

    public MethodSignature(String methodName, List<Argument> arguments) {
        this.methodName = methodName;
        this.arguments = arguments;
    }

    public MethodSignature(String methodName) {
        this(methodName, new ArrayList<>());
    }

    public String getAccessModifier() {
        return accessModifier;
    }

    public void setAccessModifier(String accessModifier) {
        this.accessModifier = accessModifier;
    }

    public String getReturnType() {
        return returnType;
    }

    public void setReturnType(String returnType) {
        this.returnType = returnType;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public List<Argument> getArguments() {
        return arguments;
    }
    public static class Argument{
        private String type;
        private String name;

        public Argument(String type, String name) {
            this.type = type;
            this.name = name;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
/*
List<String> result = new ArrayList<>();
        String w = source;

        for (String s : delimiters) {
            StringTokenizer st = new StringTokenizer(w, s);
            w = "";
            while (st.hasMoreTokens()) {
                w = w + st.nextToken() + " ";
            }
        }

        StringTokenizer st2 = new StringTokenizer(w, " ");
        while (st2.hasMoreTokens()) {
            result.add(st2.nextToken());
        }
        return result;
 */
