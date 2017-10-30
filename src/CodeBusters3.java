
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

import Authentication.Authenticate;
import Tweets.TweetsGetter;

/**
 * Authenticate Consumer Keys [Check AuthenticateInterface for keys]
 * <p>
 * TweetsGetter class has all functions implemented for getting tweets
 * <p>
 * createInstance() is a function in TweetsGetter to instantiate twitter4j
 * <p>
 * variables query() is a function to search for text on twitter search
 * <p>
 * sendToCSV() generates "Tweets.csv" file which includes usernames and tweets.
 * <p>
 * 
 * @author Sohan M. Nipunage
 *
 */
public class CodeBusters3 {

	public static void main(String[] args) {

		Authenticate auth = new Authenticate();
		TweetsGetter tg = new TweetsGetter();
		tg.createInstance(auth.cb);
		tg.query("religious extremism", 100);
		tg.sendToCSV();
	}
}
