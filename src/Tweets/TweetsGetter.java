/**
 * Copyright (C) ${2017} ${Sohan M. Nipunage} <smn57958@uga.edu>

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
 * 
 */

package Tweets;

import static java.lang.System.out;

import java.nio.charset.Charset;
import java.util.List;

import com.vdurmont.emoji.EmojiParser;

import FileSystem.FileWriterSystem;
import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Status;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

/**
 * createInstance() takes ConfigurationBuilder as input
 * <p>
 * twitter4j ConfigBuilder for authentication
 * <p>
 * query() takes string query, ex query = "justice league" as input for
 * searching "justice league" on twitter
 * <p>
 * sendToCSV() generates "Tweets.csv" file in the root directory of the project
 * <p>
 * 
 * @author Sohan M. Nipunage
 */
public class TweetsGetter implements TweetsInterface {

	TwitterFactory tf;
	twitter4j.Twitter twitter;

	Query queryText;
	QueryResult result;

	FileWriterSystem fws;

	int number_of_tweets;

	public TweetsGetter() {

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see Tweets.TweetsInterface#createInstance()
	 */
	@Override
	public void createInstance(ConfigurationBuilder st) {

		tf = new TwitterFactory(st.build());
		twitter = tf.getInstance();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see Tweets.TweetsInterface#query(java.lang.String)
	 */
	@Override
	public void query(String query, int number_of_tweets) {
		queryText = new Query(query);
		this.number_of_tweets = number_of_tweets;

	}

	@Override
	public void sendToCSV() {
		String twit = null;
		int count = 0;
		Charset unsupported = Charset.forName("UTF-8");
		fws = new FileWriterSystem();
		fws.createWriter();
		out.println("Generating Tweets. . ");
		do {
			try {
				result = twitter.search(queryText);
			} catch (TwitterException e) {
				System.out.println("Error in twitter search");
				e.printStackTrace();
			}

			List<Status> tweets = result.getTweets();
			for (Status tweet : tweets) {
				if (tweet.getText().contains("RT") == true || tweet.getText().equals(twit) == true
						|| tweet.getText().contains(",") == true) {
					out.println("Retweet or same tweet skipped or ',' found ");
				} else {
					count++;
					// System.out.println("@" + tweet.getUser().getScreenName() + " - " +
					// tweet.getText());
					// username="@" + tweet.getUser().getScreenName();
					twit = tweet.getText();
					twit = EmojiParser.removeAllEmojis(twit);
					twit = twit.replace("\'", " ");
					twit = twit.replace("\"", " ");
					twit = unsupported.decode(unsupported.encode(twit)).toString();
					boolean written = fws.write(tweet.getUser().getScreenName(), tweet.getId());
					if (written == false) {
						out.println("Error in writing tweet");
					}
				}
			}
		} while ((queryText = result.nextQuery()) != null && count < number_of_tweets);
		out.println("Number of Tweets Generated = " + count);
		fws.closeWriter();

	}

}
