package alexp.blog.mybatisModel;

import alexp.blog.mybatisDao.auto.PostMapper;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class PostTest {

    private alexp.blog.mybatisModel.Post post;

    @Before
    public void setUp() {
        post = new Post();
    }

    @Test
    public void shouldReturnEmptyList() {
        PostExample postExample = new PostExample();
        postExample.createCriteria();

        // TODO: Finish this case

    }

}