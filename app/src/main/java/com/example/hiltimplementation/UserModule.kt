package com.example.hiltimplementation

import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.components.FragmentComponent
import dagger.hilt.components.SingletonComponent
import javax.inject.Named

@Module
@InstallIn(ActivityComponent::class)
class UserModule {
    @Provides
    @Named("SQL")
    fun getSQLRepository() : UserRepository{
        return SQLRepositopry()
    }

    @Provides
    @FragmentAnnonation
    fun getFireBaseRepository() : UserRepository{
        return FireBaseRepository()
    }

    //private lateinit var userRepository: UserRepository
/* lecture 3 of cheexy code
    @Provides
    fun getRepository() : UserRepository{
         return FireBaseRepository()
    }

 */


    // Lecture

    // Binding
    /* @Binds
    abstract fun getRepository(sqlRepositopry: SQLRepositopry): UserRepository*/



}