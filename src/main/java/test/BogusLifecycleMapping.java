package test;

import org.apache.maven.lifecycle.mapping.DefaultLifecycleMapping;

/**
 * @author Kohsuke Kawaguchi
 */
public class BogusLifecycleMapping extends DefaultLifecycleMapping {
    public BogusLifecycleMapping() {
        System.out.println(getClass()+" created");
    }
}
