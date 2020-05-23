package sontung.dangvu.moneytracker.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import sontung.dangvu.moneytracker.ui.list.ListFragment
import sontung.dangvu.moneytracker.ui.plan.PlanFragment
import sontung.dangvu.moneytracker.ui.report.ReportFragment

@Module
abstract class FragmentModule {

    @ContributesAndroidInjector
    abstract fun contributeListFragment() : ListFragment

    @ContributesAndroidInjector
    abstract fun contributePlanFragment(): PlanFragment

    @ContributesAndroidInjector
    abstract fun contributeReportFragment(): ReportFragment
}