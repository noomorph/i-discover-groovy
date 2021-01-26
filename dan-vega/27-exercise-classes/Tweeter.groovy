class Tweeter extends Script {
    @Override
    Object run() {
        def tweets = [
                new Tweet("This is a useful tweet, pls share!").retweet(),
                new Tweet("This is my first tweet").favorite()
        ]

        tweets.reverse().forEach { println it }
    }
}

