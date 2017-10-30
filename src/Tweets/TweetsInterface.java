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

public interface TweetsInterface {

	public void createInstance(ConfigurationBuilder st);

	public void query(String query, int number_of_tweets);

	public void sendToCSV();

}
