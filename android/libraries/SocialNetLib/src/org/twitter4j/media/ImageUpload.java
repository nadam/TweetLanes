/*
 * Copyright 2007 Yusuke Yamamoto
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.twitter4j.media;

import org.twitter4j.TwitterException;

import java.io.File;
import java.io.InputStream;

/**
 * @author Rémy Rakic - remy.rakic at gmail.com
 * @author Takao Nakaguchi - takao.nakaguchi at gmail.com
 * @author withgod - noname at withgod.jp
 * @since org.twitter4j 2.1.8
 */
public interface ImageUpload {
    public String upload(File image, String message) throws TwitterException;

    public String upload(File image) throws TwitterException;

    public String upload(String imageFileName, InputStream imageBody) throws TwitterException;

    public String upload(String imageFileName, InputStream imageBody, String message) throws TwitterException;
}
