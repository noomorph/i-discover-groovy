package com.twitterExample

class Tweet {
  Date createdAt
  String author
  String message

  protected int retweets
  protected int favorites
  def getRetweets() { retweets }
  def getFavorites() { favorites }

  def retweet() { retweets++; this }
  def heart() { favorites++; this }
  
  String[] getMentions() {
    (message =~ /@\w+/) as List
  }

  String[] getHashtags() {
    message.findAll(/#\w+/)
  }

  @Override
  String toString() {
    """\
$message
${author ? "Author: $author\n" : ""}\
Retweets: $retweets
Favorites: $favorites
Mentions: ${mentions.join(', ')}
Hashtags: ${hashtags.join(', ')}\
"""
  }
}


