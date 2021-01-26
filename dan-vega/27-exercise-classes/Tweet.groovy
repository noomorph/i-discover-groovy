class Tweet {
    String id
    Date createdOn
    String message
    Stats stats

    Tweet(message) {
        this.id = UUID.randomUUID().toString()
        this.createdOn = new Date()
        this.message = message
        this.stats = new Stats(retweets: 0, favorites: 0)
    }

    def retweet() {
        this.stats.retweets += 1; this
    }

    def favorite() {
        this.stats.favorites += 1; this
    }

    @Override
    String toString() {
        return """
       ----------
       |$message
       |---------
       |Created at: ${createdOn.format 'yyyy-MM-dd HH:mm:ss'}
       |Re-tweets: $stats.retweets
       |Favorites: $stats.favorites
       |Share: https://tweet.me/$id
       |---------
        """
    }

    static class Stats {
        BigInteger retweets
        BigInteger favorites
    }
}

