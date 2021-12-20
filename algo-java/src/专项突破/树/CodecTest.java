package 专项突破.树;

import org.junit.jupiter.api.Test;
import struct.TreeNode.TreeNode;

class CodecTest {

    @Test
    void serialize() {
        Codec codec = new Codec();
        TreeNode node = new TreeNode(0);
        TreeNode root = node;
        node.left = new TreeNode(1);
        node.right = new TreeNode(2);
        node = node.right;
        node.left = new TreeNode(4);
        node.right = new TreeNode(3);
        String serialize = codec.serialize(root);
        assert "0,1,#,#,2,4,#,#,3,#,#".equals(serialize);

        TreeNode deserialize = codec.deserialize(serialize);
        assert deserialize.val == 0;
    }

    @Test
    void serialize2() {
        Codec codec = new Codec();
        String serialize = codec.serialize(null);
        assert "#".equals(serialize);

        TreeNode deserialize = codec.deserialize(serialize);
        assert deserialize == null;
    }
}