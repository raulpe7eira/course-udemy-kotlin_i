package repository

import entity.FullParameters

class PostRepository private constructor() {
    companion object :BaseRepository() {
        fun getAllPosts(fullParameters: FullParameters) = super.execute(fullParameters)

        fun getSinglePost(fullParameters: FullParameters) = super.execute(fullParameters)
    }
}
