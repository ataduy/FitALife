package com.example.fitalife;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.storage.FirebaseStorage;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppViewModel_Factory implements Factory<AppViewModel> {
  private final Provider<FirebaseAuth> authProvider;

  private final Provider<FirebaseFirestore> dbProvider;

  private final Provider<FirebaseStorage> storageProvider;

  public AppViewModel_Factory(Provider<FirebaseAuth> authProvider,
      Provider<FirebaseFirestore> dbProvider, Provider<FirebaseStorage> storageProvider) {
    this.authProvider = authProvider;
    this.dbProvider = dbProvider;
    this.storageProvider = storageProvider;
  }

  @Override
  public AppViewModel get() {
    return newInstance(authProvider.get(), dbProvider.get(), storageProvider.get());
  }

  public static AppViewModel_Factory create(Provider<FirebaseAuth> authProvider,
      Provider<FirebaseFirestore> dbProvider, Provider<FirebaseStorage> storageProvider) {
    return new AppViewModel_Factory(authProvider, dbProvider, storageProvider);
  }

  public static AppViewModel newInstance(FirebaseAuth auth, FirebaseFirestore db,
      FirebaseStorage storage) {
    return new AppViewModel(auth, db, storage);
  }
}
