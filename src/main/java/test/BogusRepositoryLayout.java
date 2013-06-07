package test;

import org.apache.maven.artifact.Artifact;
import org.apache.maven.artifact.metadata.ArtifactMetadata;
import org.apache.maven.artifact.repository.ArtifactRepository;
import org.apache.maven.artifact.repository.layout.ArtifactRepositoryLayout;

/**
 * @author Kohsuke Kawaguchi
 */
public class BogusRepositoryLayout implements ArtifactRepositoryLayout {
    public String getId() {
        return "bogus";
    }

    public String pathOf(Artifact artifact) {
        return "";
    }

    public String pathOfLocalRepositoryMetadata(ArtifactMetadata metadata, ArtifactRepository repository) {
        return "metadata.xml";
    }

    public String pathOfRemoteRepositoryMetadata(ArtifactMetadata metadata) {
        return "metadata.xml";
    }
}
