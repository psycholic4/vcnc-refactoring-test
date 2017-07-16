package kr.co.vcnc.android.sample.model;

import android.support.annotation.StringDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
@StringDef({GithubTreeType.BLOB, GithubTreeType.TREE})
public @interface GithubTreeType {
    String BLOB = "blob";
    String TREE = "tree";
}
