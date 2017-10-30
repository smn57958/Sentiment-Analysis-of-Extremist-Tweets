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

package Authentication;

import twitter4j.conf.ConfigurationBuilder;

/**
 * Authenticates your Consumer API keys with Twitter
 * <p>
 * All the strings are defined in AuthenticateInterface
 * <p>
 * To modify/change keys, change strings in AuthenticateInterface
 * <p>
 * 
 * @author Sohan M. Nipunage
 * @see dev.twitter.com
 * @see apps.twitter.com
 * @see twitter4j.com
 */
public class Authenticate implements AuthenticateInterface {

	public ConfigurationBuilder cb;

	/**
	 * Defines ConfigurationBuilder object
	 * <p>
	 * Associates Keys for authentication
	 * <p>
	 */
	public Authenticate() {
		cb = new ConfigurationBuilder();
		cb.setDebugEnabled(true);
		cb.setOAuthConsumerKey(API_key);
		cb.setOAuthConsumerSecret(API_secret);
		cb.setOAuthAccessToken(AccessToken);
		cb.setOAuthAccessTokenSecret(AccessTokenSecret);
	}

}
