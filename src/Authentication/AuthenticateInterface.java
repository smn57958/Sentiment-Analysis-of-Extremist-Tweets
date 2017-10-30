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

import java.math.BigInteger;

/**
 * This is an Interface that defines all the final API KEY strings required for
 * authentication
 * 
 * @author Sohan M. Nipunage
 */
public interface AuthenticateInterface {
	static final String API_key = "u4dBdL8KpUFkbOc8bq6F79BdX"; // Consumer API Key Twitter
	static final String API_secret = "leiWtciSLgI0bq9UzEJ43oqh9wjvm5gZmcUJQaF62c0pW8OVLj";// Consumer API Secret
	static final String owner = "code4busters";// Application owner name
	static final BigInteger owner_id = new BigInteger("921102249841057792"); // Owner ID
	static final String AccessToken = "921102249841057792-qMobzm2T9dMeDzUwPUps7boUsmHvUxV";
	static final String AccessTokenSecret = "YSLZB8IiKU0UWv1FR3z0epkGu84kbRR01PmZqcctW8ExU";

}
